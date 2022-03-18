package yandexPrakticum.SprintTwo;

class PhoneNumberMasker {
    public String maskPhoneNumber(String phoneNumber) {
        String phonenumber = "8(123)4567890";
        if (phonenumber.startsWith("+")) {
            return phoneNumber.substring(0, 2) + "******" + phoneNumber.substring(phoneNumber.length() - 4);
        } else if (phonenumber.startsWith("8")) {
            return phoneNumber.substring(0, 1) + "******" + phoneNumber.substring(phoneNumber.length() - 4);
        }
        return phonenumber;
    }
    public static void main(String[] args) {
        PhoneNumberMasker masker = new PhoneNumberMasker();
        System.out.println(masker.maskPhoneNumber("8(123)4567890"));
        System.out.println(masker.maskPhoneNumber("+7(123)4567890"));
    }
}