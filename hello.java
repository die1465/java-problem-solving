import java.text.SimpleDateFormat;
import java.util.Date;



import java.util.*;
public class hello{
    public static void main(String[] args) {
     challenge we = new challenge();
     we.create(); 
    }
}

class password{
    void pass(){
        Scanner in = new Scanner(System.in);
        System.out.println("what is ur password: ");
        {
            String pass = in.nextLine();
            System.out.println("ur password is: "+pass);
        }
    }
}

class letters {
    void letter() {
        Scanner in = new Scanner(System.in);
        System.out.println("input string to calculate letters and numbers and spaces: ");
        char[] name = in.nextLine().toCharArray();
        int let=0;
        int space =0;
        int num =0;
        
        for( int i= 0; i<name.length;i++){
            if(Character.isAlphabetic(name[i])){
                let++;
            }else if(Character.isWhitespace(name[i])){
                space++;
            }else if(Character.isDigit(name[i])){
                num++;
            }
        }
        System.out.println("letters: " + let);
        System.out.println("spaces: "+space);
        System.out.println("numbers: "+num);
    }
}

class unique{
    void three(){
        int amount=0;
        for(int i=1; i<=4;i++){
            for (int j = 1; j <=4; j++) {
                for (int k = 1; k <=4; k++) {
                    if(i!=j && i!=k && k!=j){
                    amount++;
                    System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("total number of three digit number is "+amount);
    }
}


class twink{
    void twnk(){
        System.out.println("twinkle, twinkle, little star,");
        System.out.println("        how i wonder what you are!");
        System.out.println("                up above the world so high,");
        System.out.println("                like a diamond in the sky.");
        System.out.println("twinkle, twinkle, little star,");
        System.out.println("        how i wonder what you are!");
    }
}

class n{
    void num(){
        Scanner in = new Scanner(System.in);
        System.out.println("value of n: ");
        int na = in.nextInt();
        int na1 = na*11;
        int na2 = na*111;
        System.out.println(na + na1+na2);
    }
}

class time{
    void tim(){
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
        Date date = new Date();
        System.out.println("now: "+formater.format(date));

    }
}

class challenge{
    void od(){
        //count time to finish in nanosecs
        long starttime = System.nanoTime();
        for (int i = 1; i < 100; i++) {
            if(i%2>0){
                System.out.println(i);
            }
        }
            //count the number of even and odd numbers in an array
            int even=0;
            int odd=0;
            int[] a ={12,32,12,44,65,76,87,98,99,432,132,45,34};
            for (int i : a) {
                System.out.print(i + ", ");
            }
            System.out.println(" ");
            for (int i = 0; i < a.length; i++) {
                if(i%2>0){
                    odd= odd+a[i];
                }else if(i%2==0){
                    even= even+a[i];
                }
            }
            System.out.println("sum of even elements in the array is: "+even);
            System.out.println("sum of odd elements in the array is: "+odd);
            System.out.println("time took to finish in nanoseconds is: "+(System.nanoTime()-starttime));
    }
    void check(){
        Scanner in = new Scanner(System.in);
        System.out.print("num to check if even or odd: ");
        int num = in.nextInt();
        if(num%2>0){
            System.out.println("odd 0");
        } else if(num%2==0){
            System.out.println("even 1");
        }
        //write the number in words
        String[] name = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eigth", "nine"};
        int x;int y;int z;
        if(num<10){
            System.out.println("in english: "+name[num]);
        }else if(num<100){
            x = num/10;
            y = num-x*10;
            System.out.println("in english: "+ name[x] +" "+ name[y]);
        }else if(num>=100){
            x = num/100;
            y = (num-x*100)/10;
            z =num-x*100-y*10;
            System.out.println("in english: "+name[x]+" "+name[y]+" "+ name[z]);
        }
        //check if an array has 10 next to 10 or 20 next to 20 but not both
        int[] a ={12,3,2,10,10,32};
        int n=0;
        for (int i = 0; i < a.length; i++) {
            n=i+1;
            if(n==a.length){
                break;
            }
            if(a[i]==10){
                if(a[i]==a[n]){
                System.out.println(true);
            }else if(a[i]!=a[n]){
                continue;
            }
        }else if(a[i]==20){
            if(a[i]==a[n]){
                System.out.println(true);
            }else if(a[i]!=a[n]){
                System.out.println(false);
            }
            continue;
        }else if(a[i]==20 &&a[i]==10){
            continue;
        }
        }
        //check if 10 and 20 are in one string
        int[] c={12,32,10,56};
        int chec =0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]==10){
                chec++;
            }else if(c[i]==20){
                chec++;
            }
        }
        if(chec>=2){
            System.out.println("there is a 10 and 20 in this list");
        }else if(chec<2){
            System.out.println("there is NO 10 and 20 in this list");
        }
        //check if a value is next to the same value or seprated by one value of an array
        int[] d ={12,12,654};
        int m =0;
        int che=0;
        for (int i = 0; i < d.length; i++) {
            m=i-1;
            if(m<0 || m-1<0){
                continue;
            }
            if(d[i]==d[m]){
                m++;
            }else if(d[i]==d[m-1]){
                m +=2;
            }
        }
        if(m==1){
            System.out.println("same value repeated next to each other ");
        }else if(m>1){
            System.out.println("same value repeated with a value between them");
        }else if(m<1){
            System.out.println("no value repeated");
        }
    }
    void five(){
        System.out.println("divided by 5: ");
            for (int j = 1; j <=100; j++){
            if (j%5==0){
                
                System.out.print(j+", ");
            }
        }
        
    }
    void three(){
        System.out.println("divided by 3: ");
        for (int i = 1; i <=100; i++) {
            if(i%3==0){
                
                System.out.print(i + ", ");
            }}
    }
    void thf(){
        System.out.println("divided by 3 & 5: ");
        for (int k = 1; k <=100; k++){
            if(k%3==0 && k%5==0){
                
                System.out.print(k + ", ");
            }
        }
    }

    void tree(){
        Scanner in = new Scanner(System.in);
        System.out.print("input the first number: ");
        int num = in.nextInt();
        System.out.print("input the second number: ");
        int num2 = in.nextInt();
        System.out.print("input third number: ");
        int num3 = in.nextInt();
        
        if((num + num2) == num3){
            System.out.println(true);
        }else if((num + num2)!=num3){
            System.out.println(false);
        }
    }

    void conv(){
        Scanner in = new Scanner(System.in);
        System.out.println("number to convert to hour, min, and sec: ");
        int num = in.nextInt();
        int sec = num%60;
        int hour = num/60;
        int min = hour%60;
        hour = hour/60;
        System.out.println(hour+":"+min+":"+sec);


    }
    void reversestring(){
        Scanner in = new Scanner(System.in);
        System.out.println("input string to reverse string");
        char[] str = in.nextLine().toCharArray();
        for (int i = str.length-1; i>=0; i--) {
            System.out.print(str[i]);
        }
        System.out.println(" ");
    }
    void reversearr(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            System.out.print(i +", ");
        }
        System.out.println(" ");
        int end = arr.length -1;
        for (int i = end; i >=0; i--) {
            System.out.print(arr[i] +", ");
           
        }
        System.out.println(" ");
    }
    void range(){
        Scanner in = new Scanner(System.in);
        System.out.print("lowest number in range: ");
        int range = in.nextInt();
        System.out.print("highest number in range: ");
        int range2 = in.nextInt();
        System.out.print("enter the number to find all the numbers that are divisble by it in the range: ");
        int num = in.nextInt();
        for (int i = range; i <=range2; i++) {
            if(i%num==0){
                System.out.println(i + " is divisble by " + num);
            }
        }
    }

    void factor(){
        Scanner in = new Scanner(System.in);
        System.out.print("input a number to find factors of that number: ");
        int num = in.nextInt();
        int fact =0;
        for (int i = 1; i < 100; i++) {
            if(num%i==0){
                fact++;
                System.out.println(i);
            }
        }
        System.out.println(num+" has " + fact+" factors");
    }

    void cap(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the sentence to be capitalized: ");
        char[] str = in.nextLine().toCharArray();
        str[0] = Character.toUpperCase(str[0]);
        for (int i = 0; i < str.length; i++) {
            if(Character.isWhitespace(str[i])){
                str[i+1] = Character.toUpperCase(str[i+1]);
            }

        }
        System.out.println(str);
    }
    void lower(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a sentence in capital letters so i could lower them: ");
        char[] str = in.nextLine().toCharArray();
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toLowerCase(str[i]);

        }
        System.out.println(str);
    }
    void accept(){
        Scanner in = new Scanner(System.in);
        System.out.print("input the first number: ");
        int num = in.nextInt();
        System.out.print("input the second number: ");
        int num2 = in.nextInt();
        System.out.print("input the third number: ");
        int num3 = in.nextInt();
        if((num>=20 || num2>=20 || num3>=20) && ((num-num2)>num3 || (num2-num3)>num || (num3-num)>num2 || (num2-num)>num3 || (num3-num2)>num || (num-num2)>num2)){
            System.out.println(true);
            
        } else if(num<20 || num2<20 || num3<20){
            System.out.println(false);
        }
    }
    void largernum(){
        Scanner in = new Scanner(System.in);
        System.out.print("input the first number: ");
        int num = in.nextInt();
        System.out.print("input the second number: ");
        int num2 = in.nextInt();
        if(num > num2){
            System.out.println(num+" is the largest number");
        }else if(num2 > num){
            System.out.println(num2+" is the largest number");
        }else if(num==num2){
            System.out.println("equal");
        }
    }
    void common(){
        Scanner in = new Scanner(System.in);
        System.out.print("input the first number: ");
        int num = in.nextInt();
        System.out.print("input the second number: ");
        int num2 = in.nextInt();
        // return true if a common digit in each number
        if((num>=25 && num<=75) && (num2>=25 && num2<=75)){
            System.out.println(true);
            
        }
        
    }

    void mod(){
        Scanner in = new Scanner(System.in);
        System.out.print("input the first number: ");
        int num = in.nextInt();
        System.out.print("input the second number: ");
        int num2 = in.nextInt();
        int num3 = num%num2;
        System.out.println(num3);
    }
    void prime(){
        //calculate sum first 100 numbers
        int num=0;

        for (int i = 0; i < 100; i++) {
            if((i%2>0) || (i%3>0) || (i%4>0) || (i%5>0) || (i%6>0) || (i%7>0)
            || (i%8>0) || (i%9>0) || (i%10>0)){
                num= num+i;
            }
        }
        System.out.println("sum of first 100 prime nums: " + num);
    }

    void insert(){
        //insert word in the middle of a string
        String mainsen = "hacking cool";
        String word = "is";
        System.out.println(mainsen.substring(0, 7) + " "+ word + " "+mainsen.substring(8));
        
    }
    void four_copies(){
        //make 4 copies of the last 3 letters of the string
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = in.nextLine();
        String nw = str.substring(str.length()-3);
        System.out.println(nw.repeat(4));
        //last 3 chars from a string and but them at the start and finish of that word, more that 3 chars
        if(str.length()>3){
            System.out.println(str.substring(str.length()-3)+""+str+""+str.substring(str.length()-3));
        }
        
    }
    void extract(){
        // first half of an even length string
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = in.nextLine();
        if(str.length()%2==0){
            System.out.println(str.substring(0, str.length()/2));
        }
    }

    void concatenation(){
        //short+long+short strings
        Scanner in = new Scanner(System.in);
        System.out.println("enter string 1: ");
        String str = in.nextLine();
        System.out.println("enter string 2: ");
        String str2 = in.nextLine();
        if(str.length()>str2.length()){
            System.out.println(str2+str+str2);
        }else if(str2.length()>str.length()){
            System.out.println(str+str2+str);
        }
    }
    void remove(){
        //remove first character from 2 strings then add them
        Scanner in = new Scanner(System.in);
        System.out.println("enter string 1: ");
        String str = in.nextLine();
        System.out.println("enter string 2: ");
        String str2 = in.nextLine();
        System.out.println(str.substring(1) + str2.substring(1));
    }
    void  hashtag(){
        // first 3 chars of a string, if less than 3 then put 3 hastags
        Scanner in = new Scanner(System.in);
        System.out.println("enter string: ");
        char[] str = in.nextLine().toCharArray();
        if(str.length>=3){
            System.out.println(str[0]+""+str[1]+""+str[2]);
        } else if(str.length<3){
            System.out.println("###");
        }

    }
    void firstlast(){
        //take 2 strings, take first and last char of each, if length of either is 0 then # for missing char
        Scanner in = new Scanner(System.in);
        System.out.println("enter string 1: ");
        String str = in.nextLine();
        System.out.println("enter string 2: ");
        String str2 = in.nextLine();
        if(str.length()>0 && str2.length()>0){
            System.out.println(str.charAt(0) + str2.charAt(0));

        }else if(str.length()==0 && str2.length()>0){
            System.out.println("#" + str2.charAt(0));
        }else if(str.length()>0 && str2.length()==0){
            System.out.println(str.charAt(0) + "#");
        }
        
    }
    void ten(){
        //check if 10 is either at the last for start of the array
        int[] a = {10,23,4,5,10};
        if(a[0]==10 || a[a.length -1]==10){
            System.out.println(true);
        }else if(a[0]!=10 || a[a.length-1]!=10){
            System.out.println(false);
        }
    }

    void test(){
        //check if first and lest elem of 2 arrays is the same
        long starttime = System.nanoTime();
        int[] a ={12,32,432,2,435,12};
        int[] b ={12,32,4324,546,456,34,12};
        if(a[0]==a[a.length-1] && b[0]==b[b.length-1]){
            System.out.println(true);
        }else if(a[0]!=a[a.length-1] && b[0]!=b[b.length-1]){
            System.out.println(false);
        }
        //check how long it took to execute the code in nanosecs
        System.out.println("time in nanoseconds :"+(System.nanoTime() - starttime));
    }

    void twoarr(){
        //take first and last num from array in new one
        int[] a ={1,2,34,5,3,43};
        int[] b={21,3,342,234,234};
        int[] c = new int[1];
        c[0] = a[0];
        c[1] = b[b.length-1];
        System.out.print("new array: ");
        for (int i : c) {
            System.out.print(i);
        }
    }

    void foursev(){
        //check if array has 4 or 7
        Scanner in =  new Scanner(System.in);
        int[] a = new int[2];
        System.out.println("enter the number for the array: ");
        for (int i = 0; i < 2; i++) {
            
            int num = in.nextInt();
            a[i] =num;
        }
        if(a[0]==4 || a[1]==4 || a[0]==7 || a[1]==7){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    void rotate(){
        //rotate one array to the left
        int[] a={20,30,40};
        System.out.println(a[2]+" "+a[1]+" "+a[0]);
        //find the largest elem between the first and last in array
        if(a[0]>a[2]){
            System.out.println("the largest element between the first and last value is: "+a[0]);
        }else if(a[2]>a[0]){
            System.out.println("the largest element between the first and last value is: "+a[2]);
        }
        //swap last element with first
        int x = a[0];
        a[0]=a[a.length-1];
        a[a.length-1] = x;
        for (int i : a) {
            System.out.print(i);
        }
        
        int[] b = {123,342,23,4,56,4,56,623,412,3,1};
        //rearrange odd comes before even ints
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2>0){
                System.out.print(b[i]+", ");
            }
        }
        
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2==0){
                System.out.print(b[i]+", ");
            }
        }
        System.out.println(" ");
    }
    void fin(){
        //find largest value from first last and ,od from array (even length)
        int[] a={1,3,-5,4};
        if(a[0]>a[a.length-1]&&a[0]>a[a.length/2]){
            System.out.println("the largest element between the first and last and mid value is: "+a[0]);
        }else if(a[0]<a[a.length-1]&&a[a.length-1]>a[a.length/2]){
            System.out.println("the largest element between the first and last and mid value is: "+a[a.length-1]);
        }else if(a[a.length/2]>a[a.length-1]&&a[a.length-1]<a[a.length/2]){
            System.out.println("the largest element between the first and last and mid value is: "+a[a.length/2]);
        }
        //multiply two arrays with same elems 
        int[] b ={1,4,-5,-2};
        for (int i = 0; i < b.length-1; i++) {
            System.out.print(a[i]*b[i]+" ");
        }
    }
    
    void hi(){
        //check if fist word is hello
        String name = "Hello how are you?";
        if(name.substring(0, 5).equals("Hello")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
    void repeat(){
        Scanner in = new Scanner(System.in);
        System.out.println("input integer: ");
        int num = in.nextInt();
        num /= 2;
        if(num%2==0){
            num *=3;
            num++;
        }
        while(num%2>0){
            num /=2;
            num *=3;
            num++;
            if(num==1){
                break;
            }
        }
        System.out.println("this is "+num);
    }

    void sysprop(){
        System.out.println("system environment: ");
        System.out.println(System.getenv());
        System.out.println("system property: ");
        System.out.println(System.getProperties());
        System.out.println("security manager: ");
        System.out.println(System.getSecurityManager());
        System.out.println("system evironment PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("system environment TEMP:" );
        System.out.println(System.getenv("TEMP"));
        System.out.println("system environment USERNAME:");
        System.out.println(System.getenv("USERNAME"));
    }

    void elem(){
        //but numbers into a string array
        int n=5;
        System.out.print("string is: [");
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = String.valueOf(i);
            System.out.print(a[i]+",");
        }
        System.out.print("] \n");
    }
    void create(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to form a staircase: ");
        int num = in.nextInt();
        int a=0;
        String mon = "$";
        for (int i = 0; i < num; i++) {
            System.out.println(mon.repeat(i));

        }
    }
}