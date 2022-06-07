package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 익명클래스는 한 번 쓰고 말때 사용한다. 
// 매번 생성해서 사용해야 한다면 그냥 생성한다. 
public class PrincipalDetailse {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				
				return roles;
			}
			
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				// TODO Auto-generated method stub
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAutorityImpl();
		
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});

	}

}
