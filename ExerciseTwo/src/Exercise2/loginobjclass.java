package Exercise2;

	
	import org.testng.annotations.DataProvider;
	//import org.testng.annotations.Test;

		public class loginobjclass {
			
			@DataProvider(name = "userclass")
			
			public Object[][]getDataFromDataProver(){
	 
				return new Object[][]{
					{"Username: Seth"},
					{"SessionID: SkyBroadband3303"},
					{"IP Address: 192.168.0.1"}
									};
  }
  
  
}
