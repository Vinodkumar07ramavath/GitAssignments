package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import vinodkumar.StringSort;

import java.util.Locale;

public class StringSortStepDef {
    @Given("^Take the string from the user$")
    public void take_the_string_from_the_user() throws Throwable {
        StringSort ssr=new StringSort();
        String str="Selenium";
    }

    @When("^now perform the string sorting using the stringbuilder$")
    public void now_perform_the_string_sorting_using_the_stringbuilder() throws Throwable {
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
    @Then("^Print the sorted string$")
    public void print_the_sorted_string() throws Throwable {
       System.out.println("The string is sorted");
    }
}
