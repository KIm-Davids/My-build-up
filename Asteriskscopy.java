public static void Asterisks(int n) {
		String x = "*";
		for(int y = 1; y < n; y++){
			x = x + " *";
		}
		for (int z = 0; z < n; z++){
			System.out.println(x);
		}
	}