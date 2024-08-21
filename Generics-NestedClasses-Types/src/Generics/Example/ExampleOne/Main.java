package Generics.Example.ExampleOne;

public class Main {
    public static void main(String[] args) {
        var philly = new Affiliation("city","Philadelphia, PA", "US");
        BaseBallTeam phillies = new BaseBallTeam("Philadelphia Phillies");
        BaseBallTeam astros = new BaseBallTeam("Houston Astros");
        scoreResult(phillies,3,astros,5);

        SportsTeam phillies1 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros1 = new SportsTeam("Houston Astros");
        scoreResult(phillies1,3,astros1,5);

        Team<BaseballPlayer, Affiliation> phillies2 = new Team<>("Philadelphia Phillies",philly);
        Team<BaseballPlayer, Affiliation> astros2 = new Team<>("Houston Astros");
        scoreResult(phillies2,3,astros2,5);

        var harper = new BaseballPlayer("B Harper","Right Fielder");
        var marsh = new BaseballPlayer("B Marsh","Right Fielder");
        phillies2.addTeamMembers(harper);
        phillies2.addTeamMembers(marsh);
        phillies2.listTeamMembers();
        System.out.println("Ranking: " + phillies2.rankings());

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows", "City of Adelaide, South Australia, in AU");
        var tex = new FootballPlayer("Tex Walker", "Centre Half Forward");
        afc.addTeamMembers(tex);
        afc.listTeamMembers();
        System.out.println("Ranking: " + afc.rankings());

        var guthrie = new FootballPlayer("D Guthrie", "Mid Fielder");
        afc.addTeamMembers(guthrie);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storms");
        adelaide.addTeamMembers(new VolleyballPlayer("B Black", "Setter"));
        adelaide.listTeamMembers();

        var melbourne = new Team<VolleyballPlayer, Affiliation>("Melbourne Heats");
        melbourne.addTeamMembers(new VolleyballPlayer("N Roberts", "Getter"));
        melbourne.listTeamMembers();
        scoreResult(adelaide,3,melbourne,5);

        //Team<int> victoria = new Team<>("Victoria Rangers"); primitive type is not allowed.

//        Team<Integer> victoria = new Team<>("Victoria Rangers");
//        victoria.addTeamMembers(1);
//        victoria.listTeamMembers();
//        scoreResult(victoria,4,melbourne,5);
    }

    public static void scoreResult(BaseBallTeam team1, int team1Score,
                                   BaseBallTeam team2, int team2Score) {
    String message = team1.setScore(team1Score,team2Score);
    team2.setScore(team2Score,team1Score);
    System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int team1Score,
                                   SportsTeam team2, int team2Score) {
        String message = team1.setScore(team1Score,team2Score);
        team2.setScore(team2Score,team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int team1Score,
                                   Team team2, int team2Score) {
        String message = team1.setScore(team1Score,team2Score);
        team2.setScore(team2Score,team1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
