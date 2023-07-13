package day04.solved;

public class Lion extends Animal{
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	

		public static void main(String[] args) {
			Lion simba = new Lion();
			simba.setAge(5); // setAge() method was not defined in Lion; it is inherited from Animal
			simba.roar();
		}


	
		
		
	}



