Typical usage:

mvn archetype:generate -DarchetypeGroupId=<archetype-groupId> -DarchetypeArtifactId=<archetype-artifactId> -DarchetypeVersion=<archetype-version> -DgroupId=<my.groupid> -DartifactId=<my-artifactId>

Sample usage:

mvn archetype:generate -DarchetypeGroupId=name.arungupta.bukkit -DarchetypeArtifactId=bukkit-plugin -DarchetypeVersion=0.1-SNAPSHOT -DgroupId=org.sample -DartifactId=sample -Dversion=1.0-SNAPSHOT -Darchetype.interactive=false --batch-mode

