MOHAMMED TAIB<46184533>

COLLECTIONS
1 list of operations
2 Mobile shop 

EXCEPTION HANDLING
1.handling stuff
2 job agency

STRING MANIPULATION

1.Email operation
2.validating users



LIST OF OPERATIONS

import java.util.*;
class ArrayListOps {
public static ArrayList<Integer> makeArrayListInt(int n) {
int array[]=new int[n];
for (int i = 0; i < n; i++) {
array[i]=0;
}
ArrayList<Integer>list=new ArrayList<>();
for(Integer integer:array) {
list.add(integer);
} return list;
}
public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
for(int k=0,j=list.size()-1;k<j;k++){
list.add(k,list.remove(j));
} return list;
}
public static ArrayList<Integer>changeList(ArrayList<Integer> list,int m,int n) {
int index=list.indexOf(m);
list.set(index,n);
return list;
}
}
public class Source{
public static void main(String[] args) {
ArrayListOps.makeArrayListInt(4);
ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
ArrayListOps.reverseList(list);
ArrayListOps.changeList(list,100,10);
}
}

******************************************************************
 2 MOBILE SHOP

import java.util.regex.*;

class Mobile{
// Write your code here..
HashMap<String,ArrayList<String>> mobiles=new
HashMap<String,ArrayList<String>>();
public String addMobile(String company,String model){
ArrayList<String> list=new ArrayList<String>();
if (mobiles.containsKey(company)==false){
list.add(model);
mobiles.put(company,list);
return "model successfully added";
}
else{
list=mobiles.get(company);
list.add(model);
mobiles.put(company,list);
return "model successfully added";
}
}
public ArrayList<String> getModels(String company){
ArrayList<String> list1=new ArrayList<String>();
if((mobiles.containsKey(company)==false)|(mobiles.get(company)==null)){
return null;
}
else{
list1=mobiles.get(company);
return list1;
}
}
public String buyMobile(String company,String model){
ArrayList<String> list1=new ArrayList<String>();
list1=mobiles.get(company);
if(mobiles.containsKey(company)==true&&list1.contains(model)==true){
int j=0;
if(list1.contains(model)){
j=list1.indexOf(model);
list1.remove(j);
}
mobiles.put(company,list1);
return "mobile sold successfully";
}
else{
return "item not available";
}
}
}
public class Source {
public static void main(String args[] ) throws Exception {
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	Mobile obj = new Mobile();
	obj.addMobile("Oppo", "K3");
	obj.getModels("Oppo");
	obj.buyMobile("Oppo", "K3");
}
}
*************************************************************************************************
3  HANDLING STUFF
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Activity{
  //Implement Activity class here..
  String string1;
String string2;
String operator;
public Activity(String string1, String string2, String operator) {
this.string1 = string1;
this.string2 = string2;
this.operator = operator;
}
}

public class Source {
  //Implement the two function given in description in here...
  public String handleException(Activity a) {
String string;
try {
if (a.string1.equals(null) || a.string2.equals(null))
throw new NullPointerException("Null values found");
if (!(a.operator.equals("+")) && !(a.operator.equals("-")))
throw new Exception("Default exception"+a.operator);
}
catch (NullPointerException ex) {
string= "Null values found";
//System.out.println(string);
return string;
}
catch (Exception e) {
string= "Default Exception"+a.operator;
//System.out.println(string);
return string;
}
return "No Exception Found";
}
public String doOperation(Activity a){
//String string = a.operator;
String result= new String();
switch (a.operator) {
case "+":{result=a.string1.concat(a.string2);
//System.out.println(result);
return result;
}
case "-":{ String regex=a.string2;
result=a.string1.replaceAll(regex, "");
//System.out.println(result);
return result;
}
}
return result ;
}
  
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...
	}
}
/*
class Activity{
String string1;
String string2;
String operator;
public Activity(String string1, String string2, String operator) {
this.string1 = string1;
this.string2 = string2;
this.operator = operator;
}
}
public class Source {
public String handleException(Activity a) {
String string;
try {
if (a.string1.equals(null) || a.string2.equals(null))
throw new NullPointerException("Null values found");
if (!(a.operator.equals("+")) && !(a.operator.equals("-")))
throw new Exception("Default exception"+a.operator);
}
catch (NullPointerException ex) {
string= "Null values found";
//System.out.println(string);
return string;
}
catch (Exception e) {
string= "Default Exception"+a.operator;
//System.out.println(string);
return string;
} return "No Exception Found";
}
public String doOperation(Activity a){
//String string = a.operator;
String result= new String();
switch (a.operator) {
case "+":{result=a.string1.concat(a.string2);
//System.out.println(result);
return result;
}
case "-":{ String regex=a.string2;
result=a.string1.replaceAll(regex, "");
//System.out.println(result);
return result;
}
} return result ;
}
public static void main(String args[] ) throws Exception {
Source source=new Source();
Activity activity = new Activity("Helloworld", "world", "+");
source.handleException(activity);
source.doOperation(activity);

}
}
*************************************************************************************************
4.JOB AGENCY

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyJobRepository {
static String getJobPrediction(int age, String highestQualification) throws
NotEligibleException{
String string;
if (age >= 19){
if (age >= 21 && highestQualification.equals("B.E"))
string = "We have openings for junior developer";
else if (age >= 26 && (highestQualification.equals("M.S"))||(highestQualification.equals("PhD")))
string = "We have openings for senior developer";
else if (age >= 19 && !(highestQualification.equals("B.E"))&& !(highestQualification.equals("M.S")) && 
!(highestQualification.equals("PhD")))
throw new NotEligibleException("We do not have any job that matches your qualifications");
else
string = "Sorry we have no openings for now";
}
else
throw new NotEligibleException("You are underage for any job");
return string;
}
}
public class Source {
public static String searchForJob(int age, String highestQualification) throws NotEligibleException {
String string = new String();
if (age >= 200 || age <= 0) {
throw new NotEligibleException("The age entered is not typical for a human being");
}
else {
string= CompanyJobRepository.getJobPrediction(age, highestQualification);
} return string;
}
public static void main(String args[] ) {
try {
searchForJob(34, "PhD");
} catch (NotEligibleException e) {
System.out.println(e);
}
}
}
class NotEligibleException extends Exception {
public NotEligibleException(String msg) {
super(msg);
}
}

**********************************************************************************************************
5 HIRING ON

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Candidate{
private String name;
private int id;
private int age;
private String gender;
private String department;
private int yearOfJoining;
private double salary;
public Candidate(int id, String name, int age, String gender, String department, int
yearOfJoining, double salary) {
super();
this.name = name;
this.id = id;
this.age = age;
this.gender = gender;
this.department = department;
this.yearOfJoining = yearOfJoining;
this.salary = salary;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public int getYearOfJoining() {
return yearOfJoining;
}
public void setYearOfJoining(int yearOfJoining) {
this.yearOfJoining = yearOfJoining;
}
public double getSalary() {
return salary;
}











class Implementation{
public static Map<String,Long> getCount(List<Candidate>list){

}
}
**********************************************************************************
6 Employee verification code

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Employee {
String name;
int salary;
public Employee(String name,int salary) {
    super();
this.name = name;
this.salary = salary ;
}
public String getName() {
return name ;
}
public void setName(String name) {
this.name= name ;
}
public int getSalary() {
return salary ;
}
public void setSalary(int salary) {
this.salary = salary ;
}
@Override
public String toString() {
StringBuilder sb = new StringBuilder("<");
sb.append("name: ");
sb.append(name);
sb.append(" salary: ");
sb.append("" + salary+">");
return sb.toString();
}
}
class Implementation{
if(method == SortMethod.BYNAME) {
comparator = Comparator.comparing(Employee:


}


