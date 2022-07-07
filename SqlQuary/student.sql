#join

#left outer join
#left outer join 뒤에 있는 테이블이 join의 기준이다. 
#예를들어 left outer join이면 major_mst 왼쪽 바깥에 다른 join할 테이블을 붙인다는 말이다.
SELECT
	sm.student_name AS '이름', 
	sm.student_year AS '학년',
	sm.school_code,
	scm.school_name,
	sm.major_code,
	mm.major_name
FROM
	student_mst sm
	left outer join school_mst scm ON(scm.school_code = sm.school_code)
	LEFT OUTER JOIN major_mst mm ON(mm.major_code = sm.major_code) 
WHERE
	mm.major_name LIKE '%공학%'
	or scm.school_name IN ('부산대학교', '부경대학교', '경성대학교')
ORDER BY
	sm.major_code;
	
# major_name 공학을 포함하고 있거나 
# school_name 부산대학교, 부경대학교, 부산외국어대학교

#서브쿼리(하위쿼리)
#where절에서 사용하는 서브쿼리
SELECT
	*
FROM 
	student_mst
WHERE
	school_code = (SELECT
							school_code
						FROM 
							school_mst
						WHERE
							school_name = '부산대학교')
;

SELECT
	student_code,
	student_name,
	(select
		COUNT(*)
	FROM 
		student_mst) AS student_count
FROM 
	student_mst
WHERE
	student_code = 1;


SELECT 
	sm.student_name,
	sm.school_code,
	scm.school_name
FROM 
	(SELECT
	*
	FROM 
		student_mst
	WHERE
		school_code = (SELECT
								school_code
							FROM 
								school_mst
							WHERE
								school_name = '부산대학교')) sm
LEFT OUTER JOIN school_mst scm ON(scm.school_code = sm.school_code);

#Limit

SELECT
	*
FROM 
	student_mst
LIMIT 6, 3;


#update

UPDATE
	student_mst
SET
	student_year = student_year + 1
WHERE
	student_code = 1;
	
UPDATE
	major_msts
SET
	major_name = '중어중문학과'
WHERE
	major_name = '영어영문학과';


#delete
DELETE
FROM
	student_mst
WHERE
	student_code = 10;
	
SELECT 
	* 
FROM 
	student_mst;

