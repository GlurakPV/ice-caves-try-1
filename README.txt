ICE CAVE WORLD - Fabric Mod (Quellcode)
=======================================
Enthält:
- Ganze Overworld = ein Eishöhlen-Biom (Packeis/Blaueis-Adern, Powder Snow)
- Neuer Block: Eisspitze (icecave:ice_spike), generiert in Gruppen
- Neue Mobs: Eiswürfel (Slime-Variante) und Gefrorener (Zombie-Variante)
- Strongholds bleiben aktiv -> Enderdrache ist erreichbar

WICHTIG: Ich konnte das hier NICHT kompilieren oder testen (kein Internet
in meiner Umgebung). Es kann kleine Fehler geben, v.a. bei Methodennamen,
die sich zwischen Minecraft-Versionen ändern.

BAUEN
1. JDK 21 installieren.
2. Auf https://fabricmc.net/develop/ die Versionen für deine Minecraft-
   Version nachschauen und in gradle.properties eintragen
   (minecraft_version, yarn_mappings, loader_version, fabric_version).
3. Gradle Wrapper fehlt noch: Im Ordner "gradle wrapper" ausführen
   (Gradle installiert) ODER gradlew/gradle-Ordner aus dem offiziellen
   Fabric-Example-Mod hierher kopieren.
4. ./gradlew build  (Windows: gradlew.bat build)
5. Jar liegt in build/libs/ (die ohne "-sources").

INSTALLIEREN
Fabric Loader + Fabric API installieren, Jar in .minecraft/mods legen,
NEUE Welt erstellen (Overworld-Generierung gilt nur für neue Welten).
Mit /give @s icecave:ice_spike bekommst du den Block, Mobs mit
/summon icecave:frozen bzw. icecave:ice_cube.

BEKANNTE GRENZEN
- Texturen sind einfarbige Platzhalter, tauscht sie gern gegen echte.
- Dörfer & Co. spawnen nicht, Nether/End bleiben Vanilla.
