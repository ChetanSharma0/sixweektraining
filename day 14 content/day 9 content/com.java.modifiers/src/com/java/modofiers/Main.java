package com.java.modofiers;

import com.java.modofiers.package1.ProtectedPackageTwo;
import com.java.modofiers.package1.PublicModifier;

public class Main extends ProtectedPackageTwo {

	public static void main(String[] args) {
	
PrivateModifier modifier = new PrivateModifier();
ProtectedModifier modifier2 = new ProtectedModifier();
//modifier.a=10;
modifier2.a=10;
ProtectedPackageTwo packageTwo = new ProtectedPackageTwo();
packageTwo.b=90;

Main main = new Main();
//main.b;


PublicModifier modifier3 = new PublicModifier();
modifier3.a=10;

	}

}
