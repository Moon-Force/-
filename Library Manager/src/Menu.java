
class Menu {
	public static void mainmenu() {
		System.out.println("请输入登陆方式");
		System.out.println("--------------------");
		System.out.println("|    0...读者        ");
		System.out.println("|    1...管理员      ");
		System.out.println("|    2...退出系统     ");
		System.out.println("请输入选项:");
	}

	public static void menu1() {
		System.out.println("---------------------");
		System.out.println("图书管理系统(读者)");
		System.out.println("---------------------");
		System.out.println("|    0...返回上级     |");
		System.out.println("|    1...显示图书     |");
		System.out.println("|    2...借用图书     |");
		System.out.println("|    3...归还图书     |");
		System.out.println("|    4...查询图书     |");
		System.out.println("|    5...已借图书     |");
		System.out.println("---------------------");
		System.out.println("请输入选项:");
	}

	public static void menu2() {
		System.out.println("---------------------");
		System.out.println("图书管理系统(管理员)");
		System.out.println("---------------------");
		System.out.println("|    0...返回上级     |");
		System.out.println("|    1...显示图书     |");
		System.out.println("|    2...增加图书     |");
		System.out.println("|    3...删除图书     |");
		System.out.println("|    4...修改图书     |");
		System.out.println("|    5...查询图书     |");
		System.out.println("|    6...显示读者     |");
		System.out.println("|    7...增加读者     |");
		System.out.println("---------------------");
		System.out.println("请输入选项:");
	}
}
