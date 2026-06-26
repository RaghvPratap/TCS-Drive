class Solution{
  public boolean check(int yr){
    if((yr%4==0 && yr%100!=0) || (yr%400==0))return true;
    else return false;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    return check(n);
  }
}
