import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
class Exercise2{
  public static void getSorted(Integer[] arr){
  Collections.reverse(Arrays.asList(arr));
  System.out.println(Arrays.asList(arr));
}

  public static void main(String[] args)
{
 Integer[] arr={10,20,30,40,50};
 getSorted(arr);
}
}

