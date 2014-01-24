// including a javadoc to try produce javadoc files
/**
 * Dump all command-line arguments to a standard output
 * 
 * @author Matthew Reinbold
 * @return void
 * @param strings
 */

public class DumpArgs
{
	public static void main(String[] args)
	{
		System.out.println("passed args:");
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}
}