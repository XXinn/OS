package compiler;


public class Compiler {
	/**
	 * 编译器
	 */
	public Compiler() {
		// TODO Auto-generated constructor stub
	}
	//指令译码
	public short turuToBit(String primitive) {
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
		return ir;
	}
}
