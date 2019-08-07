class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        // storage of resultant transcription
        String result = "";

        for (int i=0; i<dnaStrand.length(); ++i) {

            switch(dnaStrand.charAt(i)) {
                case 'C':
                    result += 'G';
                    break;
                case 'G':
                    result += 'C';
                    break;
                case 'T':
                    result += 'A';
                    break;
                case 'A':
                    result += 'U';
                    break;
                default:
                    result += "";
            }
        }

        return result;
    }

}
