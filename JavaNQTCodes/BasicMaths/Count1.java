import java.util.ArrayList;
class CountDigits
{
	int n = 0;
	CountDigits(int num){
	n = num;
	}

	//method

	public int countDigits(){
	ArrayList<Integer> digitList = new ArrayList<Integer>();
	if(n<0) n = n * -1;
	if(n>=0 && n<10) return 1;
	while(n > 0){
		digitList.add(n%10);
		n = n/10;
	}
	return digitList.size();

	}

}
class Count1{
	public static void main(String[] args)
{
	CountDigits obj = new CountDigits(234);
	System.out.println("Count of the digits are :  "+ obj.countDigits());	




}















}
