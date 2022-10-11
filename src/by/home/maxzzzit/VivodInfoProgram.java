package by.home.maxzzzit;

public class VivodInfoProgram {

	public static void main(String[] args) {
//		Привычный вид цикла:
//		for (int x=0; x<args.length;x++){
//			System.out.println("Информация о программе:"+args[x]);
//		}
//		Форматированный вид вывода для неиндексируемого перебора:
		for (String str:args) {
			System.out.printf("Информация о программе: %s%n", str);
		}
	}
}
