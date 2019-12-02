Istruzioni per l'uso

Progetto svolto in ambiente Windows 10 mediante Eclipse Jee 2018-12. Database gestito tramite XAMPP. 

- Creare una connessione MySQL su localhost con porta predefinita 3306. Utente root password root.
- Creare un DB a nome "maven".
- Clonare la repo.
- Importare il progetto in Eclipse con Import -> Existing Maven Project.

-- Se si presentassero errori sulla correttezza del file POM --

Verificare che i file .jar non siano danneggiati. Nel caso eliminare il contenuto della cartella ...\Usesr\[username]\.m2\repository. Tasto destro sul progetto Maven -> update Project, check su Force update of Snapshot/releases.

--

Per ultilizzare la GUI:

- RightClick sul progetto, Properties -> Turgeted Runtimes -> New... -> Apache tomcat v7.0 -> Browse... (selezionare la cartella per l'installazione) -> Download and install ... -> Finish. 
- Apply and Close
- RightClick sul progetto, Run as -> Run on Server

Per effettuare i test:

- RightClick sul progetto, Run as -> Junit Test.