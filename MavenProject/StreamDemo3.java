package com.insight.MavenProject;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;


public class StreamDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Neetha","Monika","Gowtham","Shiva","Poornima","Payal");
		names.stream().map(x->x.length()).forEach(n->System.out.println(n));
		names.stream().map(x->x.toUpperCase()).forEach(n->System.out.println(n));
		System.out.println("sorted list");
		
        names.stream().sorted().forEach(n->System.out.println(n));
		
		System.out.println("Names lengthwise descending sorted list");
		                         //compare
		Comparator<String> comp=(n1,n2)->n2.length()-n1.length();
		
		names.stream().sorted(comp).forEach(n->System.out.println(n));
		
		names.stream().filter(n->n.equals("Sai")).forEach(x->System.out.println(x));
		System.out.println("-----------------------------------------------");
		names.stream().filter(n->n.endsWith("a")).forEach(x->System.out.println(x));
	}

}
