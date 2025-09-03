Aplicacao com uso de Lombok.
Versao do Lombok: 1.18.34

Conflito de merge:
mfp1401 modificou o atributo "asa" para "motor" na branch "plane", 
enquanto migstreva modificou o mesmo atributo para "manche".
Ao fazer o merge de ambas pull requests, um conflito se deu e optamos por
adicionar ambos os atributos "manche" e "motor" no codigo, a fim de resolver o problema.

Testes com JUnit:
turnOnStallWarningTest foi modificado por mfp1401, mudando o metodo assertFalse para assertTrue, 
sem alterar as condicoes de teste exigidas pelo metodo da classe Plane. Para que o teste funcionasse
com o assertTrue, foi preciso mudar a condicao de teste, ao chamar o metodo turnOnStallWarning, 
modificando o parametro "readSpeed" de 220.0f para 140.0f. Dessa forma, o teste foi um sucesso.
A correcao foi feita por migstreva, dentro da pull request feita por mfp1401, e logo foi efetuado
o merge da branch "Branch-Marcelo" para a branch "main".

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
