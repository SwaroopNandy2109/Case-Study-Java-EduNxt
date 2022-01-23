package CaseStudyPackage;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String name;
		String dateOfBirth;
		String gender;
		String mobileNumber;
		String bloodGroup;
		String bloodBankName;
		String donorType;
		String donationDate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter Date Of Birth(dd-mm-yyyy): ");
		dateOfBirth = sc.nextLine();
		System.out.println("Enter Gender: ");
		gender = sc.nextLine();
		System.out.println("Enter Mobile Number: ");
		mobileNumber = sc.nextLine();
		System.out.println("Enter Blood Group: ");
		bloodGroup = sc.nextLine();

		System.out.println("Enter Blood Bank Name: ");
		bloodBankName = sc.nextLine();
		System.out.println("Enter Donor Type: ");
		donorType = sc.nextLine();
		System.out.println("Enter Donation Date(dd-mm-yyyy): ");
		donationDate = sc.nextLine();

		Donor donor = new Donor();
		donor.setName(name);
		donor.setDateOfBirth(dateOfBirth);
		donor.setGender(gender);
		donor.setMobileNumber(mobileNumber);
		donor.setBloodGroup(bloodGroup);
		donor.setBloodBankName(bloodBankName);
		donor.setDonorType(donorType);
		donor.setDonationDate(donationDate);
		donor.displayDonationDetails();

		sc.close();
	}

}
