class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        switch(dnaStrand) {
            case "":
                return "";
            case "C":
                return "G";
            case "G":
                return "C";
            case "T":
                return "A";
            case "A":
                return "U";

        }

        return dnaStrand;
    }

}
