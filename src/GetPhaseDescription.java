public class GetPhaseDescription {
    public static void main(String[] args) {
        MoonPhases moon = MoonPhases.NEW_MOON;
        String localMoon = MinimumTask.getPhaseDescription(String.valueOf(moon));
        assertEquals(localMoon,"\uD83C\uDF1A Новолуние");

       moon = MoonPhases.FULL_MOON;
       localMoon= MinimumTask.getPhaseDescription(String.valueOf(moon));
       assertEquals(localMoon,"\uD83C\uDF15 Полнолуние");

       moon = MoonPhases.WANING_CRESCENT;
        localMoon= MinimumTask.getPhaseDescription(String.valueOf(moon));
        assertEquals(localMoon,"\uD83C\uDF18 Убывающий серп");

        System.out.println("MoonTest.getPhaseDescription finisched");



    }
    public static void assertEquals(String actualResult, String expectedResult) {
        if (!actualResult.equals(expectedResult)) {
            System.err.println(
                    "GetPhaseDescription.getPhaseDescription error, expected: " + expectedResult
            );
        }
    }

}
