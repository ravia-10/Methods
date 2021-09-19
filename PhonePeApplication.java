package com.xworkz.methods;

public class PhonePeApplication {

	public static String transferMoney(long phoneNumber, int amount) {

		String transferMessage = "Amount " + amount+ " sent Successfully to number " + phoneNumber;
		return transferMessage;

	}

	public static String mobileRecharge(long phoneNumber, int amount) {
		String rechargeMessage = "your recharge plan is activited to jio Rs "+ amount + " to number" + phoneNumber;
		return rechargeMessage;
	}

	public static String bill(String billId) {
		String billMessage = "bill is paid to id " + billId;
		return billMessage;
	}

	public static String accountTransfer(long accountNumber, String IFSCCode,
			int amount) {
		String accountInformation = "Successfully transfered " + amount+ " to account " + accountNumber;
		return accountInformation;
	}

	public static void main(String[] args) {
		String message = PhonePeApplication.transferMoney(9877665542L, 100);
		System.out.println(message);

		String rechargeMessage = PhonePeApplication.mobileRecharge(7866755462L,
				199);
		System.out.println(rechargeMessage);

		String billMessage = PhonePeApplication.bill("b235");
		System.out.println(billMessage);

		String accountInformation = PhonePeApplication.accountTransfer(
				177782994729L, "SBIN00987", 12500);
		System.out.println(accountInformation);
	}
}
