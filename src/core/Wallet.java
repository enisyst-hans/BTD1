package core;

public class Wallet {

	private static final Wallet theWallet = new Wallet();
	private int coins = 0;
	
    private Wallet() {

    }
        
    public static Wallet getTheWallet() {
      return theWallet;
    }

	public int getCoins() {
		return coins;
	}

	public void addCoins(int pCoins) {
		coins += pCoins;
	}
	
	public boolean removeCoins(int pCoins) {
		if (coins >= pCoins) {
			coins -= pCoins;
			return true;
		}
		return false;
	}
	
	public void resetWallet() {
		coins = 0;
	}
}
