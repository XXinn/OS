package compiler;


public class Compiler {
	/**
	 * 编译器
	 */
	public Compiler() {
		// TODO Auto-generated constructor stub
	}
	//指令译码
	public byte[] turuToBit(String primitive) {
		short ir = 0;
		if(primitive.matches("[a-z]=[0-9]")) {
			char c = (char) (primitive.charAt(0)-'a');
			char number = primitive.charAt(2);
			ir = (short) (c*Math.pow(2, 8) + (number-48));
		}else if(primitive.matches("[a-z][+][+]")) {
			ir = 0b0010000000000000;
			char c = (char) (primitive.charAt(0)-'a');
			ir=(short) (ir + c*Math.pow(2, 8));
		}else if(primitive.matches("[a-z][-][-]")) {
			ir = 0b0100000000000000;
			char c = (char) (primitive.charAt(0)-'a');
			ir=(short) (ir + c*Math.pow(2, 8));
		}else if(primitive.matches("[!][A-Z][0-9]")) {
			ir = 0b0110000000000000;
			char c = (char) (primitive.charAt(1)-'A');
			char number = primitive.charAt(2);
			ir=(short) (ir + c*Math.pow(2, 8)+number-48);
		}else if(primitive.matches("end")) {
			ir = (short)0b1000000000000000;
		}
		byte[] bytes = new byte[2];
		bytes[0] = (byte)(ir/Math.pow(2,8));
		bytes[1] = (byte)(ir%Math.pow(2,8));
		return bytes;
	}
	public byte[] fileTurnToBits(String fileString){
		byte[] bytes = new byte[1024];
		String threeChar;
		for(int i = 0;i<fileString.length();i++){
			threeChar=fileString.substring(i*3,i*3+3);
			bytes[i*2] = turuToBit(threeChar)[0];
			bytes[i*2+1] = turuToBit(threeChar)[1];
		}
		return bytes;
	}
}
