import java.util.Scanner;

public class Zodiac2 {
    public static void main(String[]args) {
        int month, day;
        String Zodiac = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz Ayı Sayı Olarak Giriniz:");
        month = input.nextInt();

        System.out.print("Doğduğunuz Günü Sayı Olarak Giriniz:");
        day = input.nextInt();
        if(month<=12&&month>=1) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        Zodiac = "Oğlak";
                    } else {
                        Zodiac = "Kova";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 2) {
                if (day >= 1 && day <= 29) {
                    if (day <= 19) {
                        Zodiac = "Kova";
                    } else {
                        Zodiac = "Balık";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        Zodiac = "Balık";
                    } else {
                        Zodiac = "Koç";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        Zodiac = "Koç";
                    } else {
                        Zodiac = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        Zodiac = "Boğa";
                    } else {
                        Zodiac = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        Zodiac = "İkizler";
                    } else {
                        Zodiac = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        Zodiac = "Yengeç";
                    } else {
                        Zodiac = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day <= 19) {
                        Zodiac = "Aslan";
                    } else {
                        Zodiac = "Başak";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        Zodiac = "Başak";
                    } else {
                        Zodiac = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        Zodiac = "Terazi";
                    } else {
                        Zodiac = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 11) {
                if (day >= 1 && day < 30) {
                    if (day <= 21) {
                        Zodiac = "Akrep";
                    } else {
                        Zodiac = "Yay";
                    }
                } else {
                    isError = true;
                }
            }
            if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        Zodiac = "Yay";
                    } else {
                        Zodiac = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
            if (isError) {
                System.out.println("Hatalı Giriş Yaptınız!");
            } else {
                System.out.println("Burcunuz: " + Zodiac);
            }
        }else{
            System.out.println("Hatalı Giriş Yaptınız!");
        }

    }
}