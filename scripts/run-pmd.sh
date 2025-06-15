#!/bin/bash

success=true
for file in "$@"; do
  if [[ "$file" == *.java ]]; then
    echo "Checking $file..."
    pmd check -d "$file" -R ./pmd/rulesets/basic-rulesets-java.xml -f text
    if [ $? -ne 0 ]; then
      success=false
    fi
  fi
done

if ! $success; then
  exit 1
fi
