import java.util.Random;

public class RegistrationNumberValidator {
    
    // Function to generate a random year between 2000 and 2050
    public static int generateRandomYear() {
        Random random = new Random();
        return random.nextInt(51) + 2000; // random integer between 2000 and 2050
    }

    // Function to check if a registration number is valid
    public static boolean isValidRegistrationNumber(String registrationNumber) {
        // Check if the string matches the format yyyybbbmmm
        if (registrationNumber.matches("\\d{4}[a-zA-Z]{3}\\d{3}")) {
            int year = Integer.parseInt(registrationNumber.substring(0, 4));
            // Check if the year is between 2000 and 2050
            if (year >= 2000 && year <= 2050) {
                return true;
            }
        }
        return false;
    }

    // Function to count valid registration numbers in an array
    public static int validRegistrationCount(String[] registrationNumbers) {
        int count = 0;
        for (String registrationNumber : registrationNumbers) {
            if (isValidRegistrationNumber(registrationNumber)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Generate an array of 1000 registration numbers
        String[] registrationNumbers = new String[1000];
        for (int i = 0; i < 1000; i++) {
            int year = generateRandomYear();
            String bbb = ""; // Generating random bbb part (letters)
            for (int j = 0; j < 3; j++) {
                char randomChar = (char) (Math.random() * 26 + 'a');
                bbb += randomChar;
            }
            String mmm = String.format("%03d", i); // Generating mmm part (numbers padded with zeros)
            registrationNumbers[i] = String.valueOf(year) + bbb + mmm;
        }

        // Count valid registration numbers
        int validCount = validRegistrationCount(registrationNumbers);
        System.out.println("Number of valid registration numbers: " + validCount);
    }
}

