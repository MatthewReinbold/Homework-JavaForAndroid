public class Image 
{
	Image()
	{
		System.out.println("Image() called");
	}

	Image(String filename)
	{
		this(filename, null);
		System.out.println("Image(String filename) called");
	}

	Image(String filename, String imageType)
	{
		System.out.println("Image(String filename, String imageType) called");
		if(filename != null)
		{
			System.out.println("reading " + filename);
			if(filename != null)
			{
				System.out.println("interpreting " + filename + " as storing a " + imageType + " image");
			}
		} 
	}

	public static void main(String[] args)
	{
		Image image = new Image();
		System.out.println();
		image = new Image("image.png");
		System.out.println();
		image = new Image("image.png","PNG");

	}
}