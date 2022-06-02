package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		System.out.println(controller.createUser().toString());
		System.out.println(controller.updateUser().toString());
		System.out.println(((CMRespDto<User>) controller.getUser()).getData());
		controller.getAnimal().getData().move();

	}

}
