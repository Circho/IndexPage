@echo off
rem setlocal
set VOB=%~dp0
set DEVENV_HOME=%VOB%\..\DevEnv

if not exist %DEVENV_HOME% mkdir %DEVENV_HOME%

xcopy "%VOB%\Tools\7-Zip" "%DEVENV_HOME%\7-Zip" /S /Y /I /R

for /R "%VOB%\Tools" %%I in ("*.zip") do (
echo %%~fI
  rem if not exist %DEVENV_HOME%\  TODO:
  "%DEVENV_HOME%\7-Zip\7z.exe" x -y -o%DEVENV_HOME% "%%~fI" 
)

