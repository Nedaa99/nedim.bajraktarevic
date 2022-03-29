package rsa;

import java.util.Random;
import java.util.Scanner;

public class RSA {
	class Key {
		private int p;
		private int q;
		private int e;
		private int publicKey;
		private int d;

		@Override
		public String toString() {
			return "[(p=" + p + ",q=" + q + "),e=" + e + ", publicKey=" + publicKey + ", d=" + d + "]";
		}
	}

	public Key generateKey() {
		Key key = new Key();
		key.p = generatePrime(100);
		key.q = generatePrime(100);
		key.publicKey = key.p * key.q;
		key.e = generateE((key.p - 1) * (key.q - 1));
		key.d = generateD(key.e, (key.p - 1) * (key.q - 1));
		return key;
	}

	public static int generateE(int t) {
		for (int el = 2; el < t; el++) {
			if (gcd(el, t) == 1) {
				return el;
			}
		}
		return 0;
	}

	public static int generatePrime(int limit) {
		while (true) {
			int number = new Random().nextInt(limit - 1) + 2;
			if (isPrime(number))
				return number;
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static int encrypt(int message, Key k) {
		return (int) ((Math.pow(message, k.e)) % (k.publicKey));
	}

	public static int generateD(int el, int t) {
		for (int i = 0; i <= 9; i++) {
			int num = 1 + (i * t);
			if (num % el == 0) {
				return num / el;
			}
		}
		return 0;
	}

	public static int decrypt(int message, Key k) {
		return (int) (Math.pow(message, k.d) % k.publicKey);
	}

	public static void main(String args[]) {
		RSA rsa = new RSA();

		Key k = rsa.generateKey();

		System.out.println(k);

		System.out.println("-------------------------------------------------");
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the message to encrypted:");
		int message = r.nextInt();
		r.close();

		int encrypted = RSA.encrypt(message, k);
		
		System.out.println("Encrypted Message: " + encrypted);
		System.out.println("-------------------------------------------------");
		System.out.println("Decrypted Message: " + RSA.decrypt(encrypted, k));
		System.out.println("-------------------------------------------------");
	}

	public static int gcd(int el, int t) {
		if (el == 0) {
			return t;
		} else {
			return gcd(t % el, el);
		}
	}
}
