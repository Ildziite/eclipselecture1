public class StaticMethodTask {
	public static int sumArgs(int arg1, int arg2, int arg3) {
		return arg1 + arg2 + arg3;
	}

	public static void main(String[] args) {
		String argString1="";
		String argString2="";
		for(String arg: args){
			argString1=argString1+arg;
		}
		System.out.println(argString1);
		for(int i=0;i<args.length;i++){
			argString2=argString2+args[i];
			//		System.out.println(arg);
		}
		System.out.println(argString2);
		
		System.out.println(sumArgs(3,5,1));
	}
}
