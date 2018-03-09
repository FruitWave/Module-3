package interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String voidspawn) {
		String collate = "";
		for (int i = 0; i < voidspawn.length(); i++) {
			char coal = voidspawn.charAt(i);
			String coalnew = "" + coal;
			if (i % 2 != 0) {
				coalnew = coalnew.toUpperCase();
			} else {
				coalnew = coalnew.toLowerCase();
			}
			collate += coalnew;
		}
		System.out.println(collate);
		return collate;
	}

}
