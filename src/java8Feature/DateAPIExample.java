package java8Feature;

import java.time.*;

public class DateAPIExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2025,8,1);
        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastWeek = today.minusDays(7);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        boolean isLeap = today.isLeapYear();

        System.out.println("------ LocalDate ------");
        System.out.println("Today: " + today);
        System.out.println("Specific Date: " + specificDate);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Week: " + lastWeek);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Is Leap Year: " + isLeap);
        System.out.println();

        // 2. LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 9, 19, 10, 30, 45);
        LocalDateTime plusHours = currentDateTime.plusHours(5);
        LocalDateTime minusMinutes = currentDateTime.minusMinutes(15);

        System.out.println("------ LocalDateTime ------");
        System.out.println("Current DateTime: " + currentDateTime);
        System.out.println("Specific DateTime: " + specificDateTime);
        System.out.println("Plus 5 Hours: " + plusHours);
        System.out.println("Minus 15 Minutes: " + minusMinutes);
        System.out.println("To LocalDate: " + currentDateTime.toLocalDate());
        System.out.println("To LocalTime: " + currentDateTime.toLocalTime());
        System.out.println();

        // 3. ZonedDateTime
        ZonedDateTime zonedNow = ZonedDateTime.now();
        ZonedDateTime specificZoned = ZonedDateTime.of(2025, 9, 19, 10, 30, 0, 0, ZoneId.of("Asia/Kolkata"));
        ZonedDateTime convertedZone = zonedNow.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("------ ZonedDateTime ------");
        System.out.println("Current ZonedDateTime: " + zonedNow);
        System.out.println("Specific ZonedDateTime: " + specificZoned);
        System.out.println("Converted to London Zone: " + convertedZone);
        System.out.println("Zone: " + zonedNow.getZone());
        System.out.println("To LocalDateTime: " + zonedNow.toLocalDateTime());
        System.out.println();

        // 4. OffsetDateTime
        OffsetDateTime offsetNow = OffsetDateTime.now();
        OffsetDateTime specificOffset = OffsetDateTime.of(2025, 9, 19, 10, 30, 0, 0, ZoneOffset.ofHours(5));
        OffsetDateTime newOffset = offsetNow.withOffsetSameInstant(ZoneOffset.ofHours(2));

        System.out.println("------ OffsetDateTime ------");
        System.out.println("Current OffsetDateTime: " + offsetNow);
        System.out.println("Specific OffsetDateTime: " + specificOffset);
        System.out.println("Offset: " + offsetNow.getOffset());
        System.out.println("Converted Offset: " + newOffset);
        System.out.println("To LocalDateTime: " + offsetNow.toLocalDateTime());
        System.out.println();



    }
}
