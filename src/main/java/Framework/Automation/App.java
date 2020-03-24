package Framework.Automation;


public class App extends MainFunctions{

	public static void main(String[] args) {
		MainFunctions mainFunctions = new MainFunctions();
		mainFunctions.start_Chrome();
		mainFunctions.navigate("https://github.com/");
	}

}
