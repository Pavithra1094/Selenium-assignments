package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args)

	{
		String[] test = "I am a software tester".split(" ");
		String result = "";
		String reverse = ""; 

		for (int i = 0; i < test.length; i++) 
		{

			String text = test[i];

			if (i % 2 != 0) 
			{

				for (int j = text.length() - 1; j >= 0; j--)
				{

					
					reverse = reverse + text.charAt(j);
				}
				result = result + reverse + " "; 

				reverse = "";
			}

			else
				result = result + test[i] + " ";
		}
		System.out.println(result); 
	}
	
	}


