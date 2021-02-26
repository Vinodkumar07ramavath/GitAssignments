package vinodkumar;

import org.testng.annotations.Test;

import java.util.Locale;

public class StringSort {
    @Test
    public void StringSort(){
        String str="Selenium";
        String y=str.toLowerCase(Locale.ROOT);
        StringBuilder sb=new StringBuilder();
        y.chars().distinct().forEach(s->sb.append((char)s));
        String str1=sb.toString();
        char arr[]=str1.toCharArray();
        char temp;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
