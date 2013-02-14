Bukkit Plugin Archetype
=======================

This is an archetype for creating Bukkit plugin. Bukkit is a Minecraft Server API. This allows this acrchetype to create a Minecraft Mod.

How to get started ?
--------------------

The following commands will install the archetype in your local maven repository.

git clone https://github.com/arun-gupta/minecraft-mod/
cd bukkit-plugin
mvn clean install

Typical usage
-------------

Maven project can be generated using the following command:

mvn archetype:generate -DarchetypeGroupId=<archetype-groupId> -DarchetypeArtifactId=<archetype-artifactId> -DarchetypeVersion=<archetype-version> -DgroupId=<my.groupid> -DartifactId=<my-artifactId> -Dversion=<my-version> -Dpackage=<my-package>


Sample usage
------------

mvn archetype:generate -DarchetypeGroupId=name.arungupta.bukkit -DarchetypeArtifactId=bukkit-plugin -DarchetypeVersion=0.1-SNAPSHOT -DgroupId=org.sample -DartifactId=sample -Dversion=1.0-SNAPSHOT -Darchetype.interactive=false --batch-mode

