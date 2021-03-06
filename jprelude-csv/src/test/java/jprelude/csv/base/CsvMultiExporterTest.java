package jprelude.csv.base;
/*
public class CsvMultiExporterTest {
    @Test
    public void test() {
        System.out.println(Integer.parseInt("65433233"));
    }

    //@Test
    public void testSomething() throws IOException {
        final Seq<Integer> records = Seq.range(1, 10);
        
        CsvExporter<Integer> export1 = CsvExporter.builder()
                .format(CsvFormat.builder()
                    .columns("Col1", "Col2", "Col3")
                    .delimiter(',')
                    .quoteMode(CsvQuoteMode.MINIMAL)
                    .autoTrim(true)
                    .build())
                .target(TextWriter.fromOutputStream(System.out))
                .recordMapper(n -> Seq.of(Arrays.asList(
                    "CellA" + n,
                    "CellB" + n,
                    "CellC" + n
                ))).build();

        CsvExporter<Integer> export2 = CsvExporter.builder()
                .format(CsvFormat.builder()
                    .columns("C1", "C2", "C3")
                    .delimiter(';')
                    .quoteMode(CsvQuoteMode.ALL)
                    .autoTrim(true)
                    .build())
                .target(TextWriter.fromOutputStream(System.out))
                .recordMapper(n -> Seq.of(Arrays.asList(
                    "CA" + n,
                    "CB" + n,
                    "CC" + n
                )))
                .build();
        
        CsvMultiExporter.<Integer>builder()
                .addExporter("exp1", export1)
                .addExporter("exp2", export2)
                .build()
                .tryToExport(records)
                .ifError(error -> 
                    System.out.println("ERROR: " + error.getMessage())
                )
                .ifErrorFail(e -> new IOException("bla", e))
                .ifSuccess(resultMap ->
                    System.out.println(String.format(
                            "SUCCESS: Exported %d recordsets.",
                            resultMap.get("exp1").getSourceRecordCount()))
                );
    }
}
*/