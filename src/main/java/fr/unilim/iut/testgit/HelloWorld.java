package fr.unilim.iut.testgit;

public class HelloWorld {
	
    public static void main( String[] args )
        {
			System.out.println( "Bonjour tout le monde!" );  
		System.out.println( "Jouons ensemble!" );  
		
		System.out.println( "Et si on jouait au FizzBuzz ?" );  
        System.out.println(FizzBuzz.getResult());

		System.out.println( "Et si on jouait au Marabout ?" );  
        System.out.println(Marabout.getResult());

		System.out.println( "Et si on jouait au Marabout de manière plus simple ?" );  
        System.out.println(MaraboutSimple.getResult());
    }
}
