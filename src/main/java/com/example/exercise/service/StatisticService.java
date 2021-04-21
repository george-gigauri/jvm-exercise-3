package com.example.exercise.service;

import com.example.exercise.Constant;
import com.example.exercise.model.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.*;

@WebService
public class StatisticService {

    @WebMethod
    public List<Covid> getStatistics() {

        String[] countries = Constant.countries;
        List<Covid> list = new ArrayList<>();

        for (String country : countries) {
            int confirmed = new Random().nextInt(99999);
            int recovered = new Random().nextInt(99999);
            int deaths = new Random().nextInt(99999);

            list.add(new Covid(country, confirmed, recovered, deaths));
        }

        return list;
    }

    @WebMethod
    public List<String> getCountries() {
        return Arrays.asList(Constant.countries);
    }

    @WebMethod
    public Covid getStatisticByCountry(String country) {
        List<Covid> statistic = getStatistics();

        for (Covid i : statistic) {
            if (i.getCountry().toLowerCase(Locale.ROOT).equals(country.toLowerCase(Locale.ROOT))) {
                return i;
            }
        }

        return null;
    }

    @WebMethod
    public int getTotalConfirmedCases() {
        return new Random().nextInt(999999999);
    }

    @WebMethod
    public int getTotalRecoveredCases() {
        return new Random().nextInt(999999999);
    }

    @WebMethod
    public int getTotalDeaths() {
        return new Random().nextInt(999999);
    }
}
