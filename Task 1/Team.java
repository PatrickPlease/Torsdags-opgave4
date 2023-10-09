class Team {
    
    private String teamName;
    private int teamRank;
    private String[] players; 

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new String[11]; 
    }

    public void setRank(int rank) {
        this.teamRank = rank;
    }
 
    @Override
    public String toString() {
        return "Hold: " + teamName + " Rang: " + teamRank;
    }
}