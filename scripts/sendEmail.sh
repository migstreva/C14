cd C14DependenciesTest
sudo apt-get install mailutils
echo "Sending email after pipeline completion" | mail -s "Pipeline" "$DEST_EMAIL"
