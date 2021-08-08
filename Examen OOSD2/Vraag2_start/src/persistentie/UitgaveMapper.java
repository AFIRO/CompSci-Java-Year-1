package persistentie;

import java.util.List;

import domein.Uitgave;

public class UitgaveMapper {
	public Uitgave[] geefUitgaven() {
		return new Uitgave[] {
				new Uitgave(2003, "Programmeren in Java", "9789043034999", "PROGRAMMEREN JAVA"),
				new Uitgave(2017, "Netwerkbeheer", "9789057523601", "WINDOWS SERVER"),
				new Uitgave(2014, "Apps maken voor Android", "9789059408395", "MOBILE"),
				new Uitgave(2006, "Head First Java", "9780596009205", "DESIGN_PATTERNS JAVA"),
				new Uitgave(2016, "Swift programmeren", "9780133950403", "PROGRAMMEREN SWIFT"),
				new Uitgave(2016, "C# in a nutshell", "9781492051138", "PROGRAMMEREN C#"),
				new Uitgave(2021, "Python crash course", "9789059056749", "PROGRAMMEREN PYTHON"),
				new Uitgave(2009, "OO Programmeren", "9789039527054", "PROGRAMMEREN JAVA"),
				new Uitgave(2010, "Het SQL Leerboek - 2010", "9789039526552", "DATABASE MySQL"),
				new Uitgave(2019, "Windows Server 2019", "9789463561129", "WINDOWS SERVER"),
				new Uitgave(2017, "Python    crash	course", "9789059056749", "PROGRAMMEREN PYTHON"),
				new Uitgave(2016, "Need to know", "9789059056849", "PROGRAMMEREN SWIFT"),
				new Uitgave(2021, "Need to know", "9789059056949", "PROGRAMMEREN JAVA")
		};
	}
}
