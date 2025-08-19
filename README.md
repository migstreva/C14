Aplicacao com uso de Lombok.
Versao do Lombok: 1.18.34

Conflito de merge:
mfp1401 modificou o atributo "asa" para "motor" na branch "plane", 
enquanto migstreva modificou o mesmo atributo para "manche".
Ao fazer o merge de ambas pull requests, um conflito se deu e optamos por
adicionar ambos os atributos "manche" e "motor" no codigo, a fim de resolver o problema.

<build>
        <plugins>
            <!-- Plugin para garantir compilação com Java 21 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.12.1</version>
                <configuration>
                    <source>${maven.compiler.source}</source>
                    <target>${maven.compiler.target}</target>
                    <encoding>${project.build.sourceEncoding}</encoding>
                </configuration>
            </plugin>
        </plugins>
    </build>
