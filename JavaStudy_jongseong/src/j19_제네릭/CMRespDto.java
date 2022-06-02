package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // getter, setter, hashcode, equals, toString 다포함 한 명령어.
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
}
