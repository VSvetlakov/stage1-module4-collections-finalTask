package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> strings = new ArrayList<>();

        for (Map.Entry<String,Set<String>> entry: projects.entrySet()) {

            String project = entry.getKey();

            Set<String> developers = entry.getValue();

            if (developers.contains(developer)){
                strings.add(project);
            }
        }

        strings.sort(new ProjectComparator());

        return strings;
    }

    static class ProjectComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {

            if (o2.length() == o1.length())
                return o2.compareTo(o1);

            return o2.length() - o1.length();
        }
    }
}
