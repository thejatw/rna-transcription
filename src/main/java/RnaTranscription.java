class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        switch(dnaStrand) {
            case "":
                return "";
            case "C":
                return "G";
            case "G":
                return "C";

        }

        return dnaStrand;
    }

}
