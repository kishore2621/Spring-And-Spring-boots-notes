package Tight_coupling;

public class Car 
{
	private Engine e = new Engine();
	 public void Start() 
	 {
		 e.run();
	 }
}
